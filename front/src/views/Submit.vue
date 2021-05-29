<template>
  <div>
    <add-file />
  </div>
</template>

<script lang="ts">
import addFile from "@/components/addFile.vue";
import { defineComponent } from "vue";
export default defineComponent({
  components: { addFile },
});
</script>
