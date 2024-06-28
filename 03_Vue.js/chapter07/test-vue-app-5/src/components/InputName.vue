<template>
    <div style="border: solid 1x gray; padding: 5px">
        이름 : <input type="text" v-model="name" />
        <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
    </div>
</template>

<!-- <script>
export default {
    name: 'InputName',
    emits: ['nameChanged1'],
    data() {
        return { name: '' };
    },
};
</script> -->

<script>
export default {
    name: 'InputName',
    // emits: ['nameChanged1'], // nameChanged1이 아닌 이벤트가 발생했으므로 경고창 출력
    // props : 부모 컴포넌트(App.vue)한테 받아온 속성
    // props를 객체로 받아오는 경우 세부 옵션까지 설정 가능
    emits: {
        nameChanged: (e) => {
            // name이 비어있지 않고, type이 string이며, 앞 뒤 공백을 제거하고 길이가 3이상일 경우 true 리턴
            return e.name &&
                typeof e.name === 'string' &&
                e.name.trim().length >= 3
                ? true
                : false;
        },
    },
    data() {
        return { name: '' };
    },
};
</script>
