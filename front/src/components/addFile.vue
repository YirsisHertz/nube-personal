<template>
  <div class="animate__animated animate__fadeIn container center">
    <h1>Submit File</h1>
    <hr />

    <form @submit.prevent="handleSubmit">
      <div class="file-field input-field">
        <div class="btn primary">
          <span>File</span>
          <input type="file" @change="file" />
        </div>
        <div class="file-path-wrapper">
          <input
            class="file-path validate"
            type="text"
            placeholder="Upload one or more files"
          />
        </div>

        <button type="submit" class="waves-effect waves-light btn secondary">
          <i class="material-icons right">send</i>Enviar
        </button>
      </div>
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

<style lang="scss">
@import "../sass/_variables.scss";

.primary {
  background: $primary;
  font-size: 1.5rem;

  &:hover {
    background: darken($primary, 5%);
  }
}
.secondary {
  background: $secondary;
  font-size: 1.5rem;

  &:hover {
    background: darken($secondary, 5%);
  }
}
</style>
