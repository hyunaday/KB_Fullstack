<template>
    <div>
        <div>
            <h2>관심있는 K-POP 가수?</h2>
        </div>
        <hr />
        <ul>
            <!-- name과 checked는 자식한테 props로 전달해주는 속성 (사용자 정의)
            idols 배열을 돌면서 idol이라는 이름으로 객체 하나씩 접근 -->
            <CheckboxItem v-for="idol in idols" :key="idol.id" :idol="idol" />
        </ul>
    </div>
</template>

<script>
// 지역 컴포넌트 등록 방법 (사용할 파일에서만 명시)
import CheckboxItem from './components/CheckboxItem2.vue';
export default {
    name: 'App',
    components: { CheckboxItem },
    data() {
        return {
            idols: [
                { id: 1, name: 'BTS', checked: true },
                { id: 2, name: 'Black Pink', checked: false },
                { id: 3, name: 'EXO', checked: false },
                { id: 4, name: 'ITZY', checked: false },
            ],
        };
    },
};
</script>
