import { ref, computed } from 'vue';
import { defineStore } from 'pinia';
import { isInDestructureAssignment } from 'vue/compiler-sfc';
// counter라는 이름의 store 정의하고 필요한 데이터 생성

export const useCounterStore = defineStore('counter', () => {
    const count = ref(0);
    const doubleCount = computed(() => count.value * 2);
    function increment() {
        count.value++;
    }

    // 마지막에 객체로 리턴해줌
    return { count, doubleCount, isInDestructureAssignment };
});
