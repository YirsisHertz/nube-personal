<template>
  <div class="home">
    <Files />
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import Files from "@/components/Files.vue"; // @ is an alias to /src

export default defineComponent({
  name: "Home",
  components: {
    Files,
  },
});
</script>
