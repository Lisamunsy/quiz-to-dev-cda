<script>

export default {
    data(){
        return {
            topics: []
        }
    },
    methods:{
        async getTopics(){
            const response = await this.$axios.get('/topics');
            return this.topics = response.data;
        }
    },
    mounted(){
        this.getTopics();
    }
}
</script>

<template>
    <div class="container">
        <h1 class="display-3 fw-normal">
            Manage the topics
        </h1>
        <table class="table table-dark">
            <thead >
                <th scope="col">Title</th>
                <th scope="col">Parent topic</th>
            </thead>
            <tbody>
                <tr v-for="topic in topics" :key="topic.id">
                    <td>{{ topic.name }}</td>
                    <td>{{ topic.parentTopicName}}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>