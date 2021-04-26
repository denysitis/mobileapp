/*Фільтрація*/
const filterBox = document.querySelectorAll('.filtration');
	document.querySelector('.product_lits_all').addEventListener('click', even => {
		if (event.target.tagName !== 'IMG') return false;
			
		let filterClass = event.target.dataset['f'];
		console.log(filterClass);
		
		filterBox.forEach( elem => {
			elem.classList.remove('none');
			if(!elem.classList.contains(filterClass)) {
				elem.classList.add('none');
			}
		});
	});