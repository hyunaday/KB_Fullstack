<template>
    <div>
        <!-- 모든 조건이 동일할 경우 가장 마지막 요소의 스타일 적용
      전역 CSS 적용되므로 세개 다 오렌지색이 된다 -->
        <Child1 />
        <Child2 />
        <Child3 />
    </div>
</template>

<script>
// import와 components는 세트다! 함께 적어주기
import Child1 from './components/Child1.vue';
import Child2 from './components/Child2.vue';
import Child3 from './components/Child3.vue';

export default {
    name: 'App',
    components: { Child1, Child2, Child3 },
};
</script>
