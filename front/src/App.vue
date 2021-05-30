<template>
  <div id="nav">
    <navbar />
    <Mode />
  </div>
  <router-view />
</template>

<script lang="ts">
import { defineComponent } from "vue";
import Navbar from "./components/Navbar.vue";
import Mode from "./components/Mode.vue";
export default defineComponent({
  components: { Navbar, Mode },
});
</script>

<style lang="scss">
body {
  transition: all 0.2s ease-in-out;
}
</style>
