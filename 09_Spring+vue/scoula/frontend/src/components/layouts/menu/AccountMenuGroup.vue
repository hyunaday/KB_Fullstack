<script setup>
import { computed } from 'vue';
import MenuItem from './MenuItem.vue';
import AccountMenuItem from './AccountMenuItem.vue';
import LogoutMenuItem from './LogoutMenuItem.vue';
import config from '@/config';

const { login, join } = config.accountMenus;

// 로그인 여부
const islogin = computed(() => false); // 임시: 로그인하지 않음
const username = computed(() => ''); // 임시: 사용자명 없음
</script>

<template>
    <ul class="navbar-nav ms-auto">
        <!-- isLogin이 true인 경우 해당 템플릿으로 묶은 부분을 보여준다 -->
        <!-- v-if는 실제로 요소를 구조에서 없앴다가 다시 만들지만 v-show는 요소는 그대로인 상태로 display만 none으로 변경한다 -->
        <!-- v-if의 경우, 자주 바뀌지 않는 곳에서 사용하고 v-show의 경우, 자주 바뀌는 곳에서 사용한다. -->
        <!-- template은 실제 구조에서는 보이지않지만 로직에서 어떤 태그들을 묶어서 처리하는 용도로 사용된다 -->
        <template v-if="islogin">
            <!-- AccountMenuItem으로 username이라는 props를 넘겨준다 -->
            <AccountMenuItem :username="username" />
            <LogoutMenuItem />
        </template>
        <template v-else>
            <MenuItem :menu="login" />
            <MenuItem :menu="join" />
        </template>
    </ul>
</template>
