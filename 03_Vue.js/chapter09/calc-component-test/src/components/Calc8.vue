<template>
    <div>
        X : <input type="text" v-model.number="x" />
        <br />
        Y : <input type="text" v-model.number="y" />
        <br />
    </div>
    <div>결과 : {{ result }}</div>
</template>

<script>
// composition API 내의 함수를 사용하려면 import 필수
import { ref, watch, watchEffect } from 'vue';

export default {
    name: 'Calc8',
    setup() {
        // computed로 계산해주기 때문에 result 초기화 필요 없어짐
        const x = ref(10);
        const y = ref(20);
        // 기존 옵션 API의 computed 옵션과 동일한 역할
        const result = ref(30);

        watchEffect(() => {
            result.value = x.value + y.value;
            console.log(`${x.value} + ${y.value} = 
            ${result.value}`);
        });
        // return을 해줘야 template 쪽에서 사용 가능
        return { x, y, result };
    },
};
</script>
