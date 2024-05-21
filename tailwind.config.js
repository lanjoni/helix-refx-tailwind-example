/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './resources/js/app.js',
  ],
  plugins: [],
  mode: 'jit',
  purge: {
    content: [
      './src/com/example/**/*.cljs'
    ]
  },
}

