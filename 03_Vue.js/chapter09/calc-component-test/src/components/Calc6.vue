<template>
    <div>
        X : <input type="text" v-model.number="state.x" />
        <br />
        결과 : {{ state.result }}
    </div>
</template>

<script>
// composition API 내의 함수를 사용하려면 import 필수
import { reactive, watch } from 'vue';

export default {
    name: 'Calc6',
    setup() {
        // computed로 계산해주기 때문에 result 초기화 필요 없어짐
        const state = reactive({ x: 0, result: 0 });
        // 첫번째 인자로는 반응성 데이터가 와야하기 때문에 state.x는 불가능
        // 화살표 함수로 객체 내의 데이터를 접근해야 한다
        watch(
            () => state.x,
            (current, old) => {
                console.log(`${old} -> ${current}`);
                state.result = current * 2;
            }
        );
        // return을 해줘야 template 쪽에서 사용 가능
        return { state };
    },
};
</script>
