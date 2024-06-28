<template>
    <div>
        <!-- 자식 컴포넌트에서 정의한 nameChanged 이벤트를 nameChanged 함수와 연결 -->
        <!-- (사용자 정의 이벤트) -->
        <InputName @nameChanged="nameChangedHandler" />
        <br />
        <h3>App 데이터 : {{ parentName }}</h3>
    </div>
</template>

<script>
export default {
    name: 'App',
    components: { InputName },
    data() {
        return {
            parentName: '',
        };
    },
    methods: {
        nameChangeHandler(e) {
            this.parentName = e.name;
        },
    },
};
</script>
