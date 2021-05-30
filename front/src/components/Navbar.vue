<template>
  <nav>
    <div class="nav-wrapper">
      <a href="#" data-target="mobile-demo" class="sidenav-trigger"
        ><i class="material-icons">menu</i></a
      >
      <ul id="nav-mobile" class="left hide-on-med-and-down">
        <li>
          <router-link to="/">Files</router-link>
        </li>
        <li>
          <router-link to="/submit">Submit</router-link>
        </li>
      </ul>
    </div>
  </nav>

  <ul class="sidenav" id="mobile-demo">
    <li>
      <router-link to="/">Files</router-link>
    </li>
    <li>
      <router-link to="/submit">Submit</router-link>
    </li>
  </ul>
</template>

<script>
export default {
  mounted() {
    M.AutoInit();
  },
};
</script>

style.<style lang="scss" scoped>
@import "../sass/_variables.scss";
nav {
  background-color: $secondary;
  font-weight: bold;
}
</style>
