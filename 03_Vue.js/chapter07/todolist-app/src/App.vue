<template>
    // 가운데 정렬을 위해 부트스트랩의 container 클래스 삽입
    <div id="app" class="container">
        <!-- 타이틀 부분 부트스트랩으로 추가 -->
        <div class="card card-body bg-light">
            <div class="title">:: TodoList App</div>
        </div>
        <div class="card card-body bg-light">
            <div class="card-body">
                <InputTodo />
                <TodoList />
            </div>
        </div>
    </div>
</template>

<script>
import TodoList from './components/TodoList.vue';
import InputTodo from './components/InputTodo.vue';

export default {
    name: 'App',
    // import와 짝꿍! 컴포넌트로 등록해줘야 함
    components: { InputTodo, TodoList },
};
</script>

<script>
import TodoList from './components/ TodoList.vue'
import
InputTodo from './components/ InputTodo.vue'

let ts = new Date().getTime()

export default {
name: "App",
components : {InputTodo , TodoList},
data() {
return {
todoList : [
{ id: ts , todo :"자전거 타기 ", completed: false},
{ id: ts+1, todo :"딸과 공원 산책 ", completed: true},
{ id: ts+2, todo :"일요일 애견 카페 ", completed: false},
{ id: ts+3, todo :"Vue 원고 집필 ", completed: false},

]
};
},
methods: {
    addTodo(todo) {
        // todo로 받아온 문자열의 길이가 2 이상일 경우에만 toddList 맨 끝에 추가
        // push : 리스트의 맨 끝에 요소 추가
        if(todo.length >=2) {
            this.todoList.push({ id: new Date().getTime(), todo: todo, completed: false})
        }
    },
    deleteTodo(id){
        // todoList 돌면서 받아온 id와 꺼내온 아이템의 id가 같을 때 해당 인덱스 반환
        // findIndex : 해당 조건과 만족하는 아이템의 인덱스 반환
        let index = this.todoList.findIndex((item)=> id === item.id);
        // splice : index자리에 있는 1개 삭제 (세번째 인자부터는 추가)
        this.todoList.splice(index,1);
    },
    toggleCompleted(id) {
        let index = this.todoList.findIndex((item) => id === item.id);
        // true일 땐 false, fasle일 땐 true, 무조건 반대값이 들어가도록 ! 붙여줌
        // 토글이란 껐다켰다 하는 기능
        this.todoList[Index].completed = !this.todoList[Index].completed;
    },
},
},
</script>
