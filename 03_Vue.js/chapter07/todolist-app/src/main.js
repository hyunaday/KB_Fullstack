import 'bootstrap/dist/css/bootstap.css';
import './assets/main.css';

import { createApp } from 'vue';
// import App from './App.vue';
import App from './App.vue';

// 전역 컴포넌트 등록 방법
// import CheckboxItem from './components/CheckboxItem.vue';
// createApp(App).component('CheckboxItem', CheckboxItem).mount('#app');

createApp(App).mount('#app');
