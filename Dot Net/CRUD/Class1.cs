using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProductLibrary
{
    public class Product
    {
        private int productId;
        private string productName;
        private decimal rate;
        private int categoryId;

        public int ProductId
        {
            get => productId;
            set
            {
                if (value <= 0)
                    throw new ProductValidationException("Product ID must be greater than 0.");
                productId = value;
            }
        }

        public string ProductName
        {
            get => productName;
            set
            {
                if (string.IsNullOrEmpty(value))
                    throw new ProductValidationException("Product Name cannot be null or empty.");
                productName = value;
            }
        }

        public decimal Rate
        {
            get => rate;
            set
            {
                if (value <= 0)
                    throw new ProductValidationException("Rate must be greater than 0.");
                rate = value;
            }
        }

        public string Description { get; set; }

        public int CategoryId
        {
            get => categoryId;
            set
            {
                if (value <= 0)
                    throw new ProductValidationException("Category ID must be greater than 0.");
                categoryId = value;
            }
        }
        private static List<Product> products = new List<Product>();

        public static List<Product> GetAllProducts()
        {
            return products;
        }

        public static Product GetSingleProduct(int productId)
        {
            return products.Find(p => p.ProductId == productId);
        }

        public static void Insert(Product product)
        {
            products.Add(product);
        }

        public static void Update(Product product)
        {
            var existingProduct = products.Find(p => p.ProductId == product.ProductId);
            if (existingProduct != null)
            {
                products.Remove(existingProduct);
                products.Add(product);
            }
        }

        public static void Delete(int productId)
        {
            var productToRemove = products.Find(p => p.ProductId == productId);
            if (productToRemove != null)
                products.Remove(productToRemove);
        }
    }

    public class ProductValidationException : Exception
    {
        public ProductValidationException(string message) : base(message) { }
    }
}
