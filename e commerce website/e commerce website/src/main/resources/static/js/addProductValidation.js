const form = document.getElementById("addProductForm");

    form.addEventListener("submit", function(event) {
      event.preventDefault();
      if (validateForm()) {
        alert("Item added successfully!");
        form.submit();
      }
    });

    function validateForm() {
      const product = document.getElementById("pName").value.trim();
      const brand = document.getElementById("brand").value.trim();
      const model = document.getElementById("model").value.trim();
      const price = document.getElementById("price").value.trim();
      const colours = document.getElementById("colours").value.trim();
      const images = document.getElementById("imageUrl").value.trim();

      // Regular expressions for validation
      const brandPattern = /^[A-Za-z]+$/;
      const pricePattern = /^[0-9]{0-10}$/;
      const coloursPattern=/^[A-Za-z,]+$/;
      const pnamePattern=/^[A-Za-z0-9]+$/;
      const imagePattern = /(http(s?):)([/|.|\w|\s|-])*\.(?:jpg|jpeg|png|gif|bmp)$/i;
     


      if (!pnamePattern.test(product) || !pnamePattern.test(model) ) {
        alert("No Special characters are allowed in Product name and Model name");
        return false;
      }
      
      if (!brandPattern.test(brand) ) {
        alert("Only alphabetical characters are allowed in brand");
        return false;
      }
      
     
      if (!coloursPattern.test(colours) ) {
        alert("Only alphabetical characters and commas are allowed in colours field");
        return false;
      }

     
      if (!pricePattern.test(price)) {
        alert("Please enter valid price");
        return false;
      }
      if (!imagePattern.test(images) ) {
        alert("enter appropriate url");
        return false;
      }

      return true;
    }
  