<template>
    <div>
        X : <input type="text" v-model.number="state.x" />
        <br />
        Y : <input type="text" v-model.number="state.y" />
        <br />
    </div>
    <button @click="calcAdd">계산</button>
    <div>결과 : {{ result }}</div>
</template>

<script>
// composition API 내의 함수를 사용하려면 import 필수
import { reactive, computed } from 'vue';

export default {
    name: 'Calc4',
    setup() {
        // computed로 계산해주기 때문에 result 초기화 필요 없어짐
        const state = reactive({ x: 10, y: 20 });
        // 기존 옵션 API의 computed 옵션과 동일한 역할
        const result = computed(() => {
            return state.x + state.y;
        });
        // return을 해줘야 template 쪽에서 사용 가능
        return { state, result };
    },
};
</script>
