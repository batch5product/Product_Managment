function myFunction2()
      { 
     
     var exp=  /^\(?([0-3]{1}[0-9]{1})\)?[-]?([0-1]{1}[0-9]{1})?[-]?([0-9]{4})$/;
	
      var product_price2 = document.productForm.product_price.value;
      var product_name2 = document.productForm.product_name.value;
      var product_exp2 = document.productForm.product_exp.value;
      product_id;
      if(isNaN(product_name2)&&(!(isNaN(product_price2)))&&(product_exp2.match(exp)))
      {
          


      return true;
      }
      else
      {
      alert('Please check your entered details');
      return false;
      }
      }