<template>
    <!-- idol 안에 있는 속성들을 따로 받아왔기 때문에 해당 속성 이름으로 변경 -->
    <!-- :checked는 실제 체크박스 안에 있는 html 속성(체크여부) -->
    <li><input type="checkbox" :checked="checked" />{{ idol }} -{{ name }}</li>
</template>

<script>
export default {
    name: 'CheckboxItem2',
    // props : 부모 컴포넌트(App.vue)한테 받아온 속성
    // props를 객체로 받아오는 경우 세부 옵션까지 설정 가능
    props: {
        id: [Number, String], // Number 또는 String 타입
        name: String,
        checked: {
            type: Boolean,
            required: false, // 필수 속성이 아니다 = 즉, 옵션이다
            default: false, // 생략하면 기본값이 false가 된다
        },
    },
};
</script>
