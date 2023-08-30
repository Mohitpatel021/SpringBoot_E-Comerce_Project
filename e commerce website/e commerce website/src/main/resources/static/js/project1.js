// let form=document.getElementById('inputForm')
// form.addEventListener('submit', function(event) {
//     event.preventDefault();
  
//     const productName = document.getElementById('pname').value;
//     const brandName = document.getElementById('brand').value;
//     const modelNumber = document.getElementById('model').value;
//     const price = document.getElementById('price').value;
//     const colours = document.getElementById('colours').value;
//     const imageUrl = document.getElementById('imageUrl').value;
  
//     const product = {
//       name: productName,
//       brand: brandName,
//       model: modelNumber,
//       price: price,
//       colours: colours,
//       imageUrl: imageUrl
//     };
  
//     // Save product to localStorage
//     let products = JSON.parse(localStorage.getItem('products')) || [];
//     products.push(product);
//     localStorage.setItem('products', JSON.stringify(products));
  
//     // Redirect to the new page
//     window.location.href = 'shop.html';
//   });
  