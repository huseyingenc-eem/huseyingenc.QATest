const { defineConfig } = require("cypress");

module.exports = defineConfig({
  projectId: "eba8rv",
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
