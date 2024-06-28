<template>
    <div>
        <Child1 />
    </div>
</template>

<script>
// import와 components는 세트다! 함께 적어주기
import Child1 from '../../../chapter08/style-test/src/components/Child1.vue';
// import Child2 from './components/Child2.vue';
// import Child3 from './components/Child3.vue';

export default {
    name: 'App',
    components: { Child1 },
};
</script>
