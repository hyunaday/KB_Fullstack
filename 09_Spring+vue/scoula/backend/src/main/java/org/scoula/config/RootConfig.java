package org.scoula.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration : 설정,
@Configuration
// 어떤 경로에서 property를 가져올지 설정 (classpath를 붙여줘야 프로젝트의 루트로 접근)
// 그냥 /를 사용하면 webapp 폴더가 루트가 된다
//@MapperScan(basePackages = {"org.scoula.mapper"})
@PropertySource({"classpath:/application.properties"})
// 20240827 - 경로 추가 : "org.scoula.member.mapper"와 "org.scoula.member.service"
@MapperScan(basePackages = {"org.scoula.board.mapper", "org.scoula.member.mapper"}) // mapper의 위치 알려주기
@ComponentScan(basePackages = {"org.scoula.board.service", "org.scoula.member.service"})
@Slf4j
@EnableTransactionManagement // 트랜잭션 관리
public class RootConfig {
    // application.properties 파일에서 값을 읽어와서 변수에 주입
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;
    
    @Value("${jdbc.username}")
    private String username;
    
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();

        // 설정 객체에 데이터베이스 연결 정보를 설정
        config.setDriverClassName(driver);
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        // HikariDatasource 객체 생성 후 설정을 적용
        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;
    }

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setConfigLocation(
                applicationContext.getResource("classpath:/mybatis-config.xml"));
        sqlSessionFactory.setDataSource(dataSource());
        return (SqlSessionFactory) sqlSessionFactory.getObject();
    }
    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource());
        return manager;
    }


}
