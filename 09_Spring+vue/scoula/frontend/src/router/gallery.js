// 사진 관련된 라우트를 정의하는 js
export default [
    {
        // 사진 페이지에 대한 라우트
        path: '/gallery/list',
        name: 'gallery/list',
        component: () => import('../pages/gallery/GalleryListPage.vue'),
    },
];
