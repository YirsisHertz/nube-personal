<template>
  <button
    class="btn waves-effect waves-light cyan darken-2"
    @click="handleMode"
  >
    Modo: {{ store.dark ? "Oscuro" : "Claro" }}
  </button>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import store from "../store/store";

export default defineComponent({
  setup() {
    const handleMode = () => {
      store.dark = !store.dark;
      const body = document.querySelector("body");

      if (store.dark) {
        body.style.background = "#212121";
        body.style.color = "#fafafa";
      } else {
        body.style.background = "#fafafa";
        body.style.color = "#212121";
      }
    };

    return { store, handleMode };
  },
});
</script>

<style lang="scss" scoped>
button {
  display: block;
  margin: 2rem auto;
}
</style>
