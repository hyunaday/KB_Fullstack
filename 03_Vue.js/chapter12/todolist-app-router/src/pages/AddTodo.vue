<template>
    <div class="row">
        <div class="col p-3">
            <h2>할일 추가</h2>
        </div>
    </div>

    <div class="row">
        <div class="col">
            <div class="form-group">
                <!-- 요소의 id값과 연결해준다 -->
                <label htmlFor="todo">할일 : </label>
                <input
                    type="text"
                    class="form-control"
                    id="todo"
                    v-model="todoItem.todo"
                />
            </div>
            <div class="form-group">
                <label htmlFor="desc">설명 : </label>
                <textarea
                    class="form-control"
                    rows="3"
                    id="desc"
                    v-model="todoItem.desc"
                ></textarea>
            </div>
            <div class="form-group">
                <!-- 버튼 클릭 시 eventHandler 동작 -->
                <button
                    type="button"
                    class="btn btn-primary m-1"
                    @click="addTodoHandler"
                >
                    추가
                </button>
                <!-- 취소 버튼 클릭 시 바로 전체 목록 페이지로 이동 -->
                <button
                    type="button"
                    class="btn btn-primary m-1"
                    @click="router.push('/todos')"
                >
                    취소
                </button>
            </div>
        </div>
    </div>
</template>

<script setup>
import { inject, reactive } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
const { addTodo } = inject('actions');
// 객체는 참조형 변수기 때문에 reactive로 반응성 만들어줌
const todoItem = reactive({ todo: '', desc: '' });

const addTodoHandler = () => {
    let { todo } = todoItem;
    // 아이템의 할일 값이 비어있으면 경고창 출력
    if (!todo || todo.trim() === '') {
        alert('할 일은 반드시 입력해야 합니다');
        // return을 만나면 함수 종료
        return;
    }
    // 넣어준 정보를 가지고 목록의 맨 뒤에 추가해줌
    addTodo({ ...todoItem }, () => {
        // 전체 목록 페이지로 이동
        router.push('/todos');
    });
};
</script>
