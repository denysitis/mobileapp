/*Меню*/
document.querySelector('.menu_btn').addEventListener('click', () => {
  document.querySelector('.menu_btn').classList.toggle('menu_btn_open');
  document.querySelector('.menu-list').classList.toggle('menu-list_open');
  document.querySelector('body').classList.toggle('body_hidden');
});