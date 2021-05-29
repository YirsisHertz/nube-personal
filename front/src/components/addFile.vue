<template>
  <div>
    <h1>Submit File</h1>
    <hr />
    <form @submit.prevent="handleSubmit">
      <input type="file" @change="file" />
      <br />
      <input type="submit" />
    </form>
  </div>
</template>

<script lang="ts">
import { defineComponent, ref } from "vue";

export default defineComponent({
  setup() {
    const files = ref(new FormData());

    const file = ({ target }) => {
      files.value = new FormData();
      files.value.append("imagen", target.files[0]);
    };

    const handleSubmit = async () => {
      await fetch("http://localhost:3300/upload", {
        method: "POST",
        body: files.value,
      });
    };

    return { handleSubmit, file };
  },
});
</script>

<style lang="sass"></style>
