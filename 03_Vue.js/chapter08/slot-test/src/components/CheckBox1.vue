<template>
    <div>
        <input
            type="checkbox"
            :value="id"
            :checked="checked"
            @change="
                $emit('check-changed', { id, checked: $event.target.checked })
            "
        />
    </div>
</template>
