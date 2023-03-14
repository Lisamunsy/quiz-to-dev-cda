<script lang="js">
import { useVuelidate } from '@vuelidate/core'
import { required } from '@vuelidate/validators'
export default {
    setup() {
        return { validator: useVuelidate() }
    },
    data() {
        return {
            inputs: {
                name: null,
                parentTopicId: null,
            },
            topics:[]
        }
    },
    validations() {
        return {
            inputs: {
                name: {
                    required
                },
                parentTopicId:{
                    required
                }
            }
        }
    },
    methods:{
        async getTopics(){
            const response = await this.$axios.get('/topics');
            return this.topics = response.data;
        },
        async submit() {
            const valide = await this.validator.$validate();
            if (valide) {
                this.$axios.post('/topics', this.inputs);
                Object.assign(this.$data.inputs, this.$options.data().inputs);
                this.validator.$reset();
            } else {
                console.log("Server Error")
            }
        }
    },
    mounted(){
        this.getTopics();
    }
}
</script>

<template>
    <div class="container-sm">
        <h1 class="display-3 fw-normal "> Create a new topic</h1>
        <form @submit.prevent="submit" class="my-3">
            <div class="mb-3">
                <label for="name" class="form-label">Name :</label>
                <input id="name" v-model="inputs.name" class="form-control" type="text" placeholder="Enter a topic name">
                <div class="form-text">
                    Between 1 and 150 characters.
                </div>
            </div>
            <div class="mb-3">
                <select class="form-select" aria-label="select a paren topic" v-model="inputs.parentTopicId">
                    <option :value="null" selected>Select a parent topic</option>
                    <option v-for="topic in topics" :key="topic.id" :value="topic.id">{{topic.name}}</option>
                </select>
                <div class="form-text">
                    Select at least the root component
                </div>
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-warning">Create</button>
            </div>
        </form>
    </div>
</template>