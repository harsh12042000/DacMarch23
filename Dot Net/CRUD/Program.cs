using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ProductLibrary;

namespace ProductsClass
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                while (true)
                {
                    Console.WriteLine("Select an option:");
                    Console.WriteLine("1. Add Product");
                    Console.WriteLine("2. Get Product by ID");
                    Console.WriteLine("3. Update Product");
                    Console.WriteLine("4. Delete Product");
                    Console.WriteLine("5. Get All Products");
                    Console.WriteLine("6. Exit");

                    int choice = GetIntInput("Enter your choice: ");

                    switch (choice)
                    {
                        case 1:
                            AddProduct();
                            break;
                        case 2:
                            GetProductById();
                            break;
                        case 3:
                            UpdateProduct();
                            break;
                        case 4:
                            DeleteProduct();
                            break;
                        case 5:
                            GetAllProducts();
                            break;
                        case 6:
                            Console.WriteLine("Exiting...");
                            return;
                        default:
                            Console.WriteLine("Invalid option. Please try again.");
                            break;
                    }

                    Console.WriteLine();
                }
            }
            catch (ProductValidationException ex)
            {
                Console.WriteLine("Validation Error: " + ex.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex.Message);
            }

            Console.ReadLine();
        }

        static void AddProduct()
        {
            Console.WriteLine("Enter the details of the new product:");

            int productId = GetIntInput("Product ID: ");
            string productName = GetStringInput("Product Name: ");
            decimal rate = GetDecimalInput("Rate: ");
            string description = GetStringInput("Description: ");
            int categoryId = GetIntInput("Category ID: ");

            var newProduct = new Product
            {
                ProductId = productId,
                ProductName = productName,
                Rate = rate,
                Description = description,
                CategoryId = categoryId
            };

            Product.Insert(newProduct);

            Console.WriteLine("Product added successfully.");
        }

        static void GetProductById()
        {
            int productId = GetIntInput("Enter the Product ID: ");
            var product = Product.GetSingleProduct(productId);

            if (product != null)
            {
                Console.WriteLine("Product details:");
                Console.WriteLine("Product ID: " + product.ProductId);
                Console.WriteLine("Product Name: " + product.ProductName);
                Console.WriteLine("Rate: " + product.Rate);
                Console.WriteLine("Description: " + product.Description);
                Console.WriteLine("Category ID: " + product.CategoryId);
            }
            else
            {
                Console.WriteLine("Product not found.");
            }
        }

        static void UpdateProduct()
        {
            int productId = GetIntInput("Enter the Product ID to update: ");
            var product = Product.GetSingleProduct(productId);

            if (product != null)
            {
                Console.WriteLine("Enter the updated details of the product:");

                string productName = GetStringInput("Product Name: ");
                decimal rate = GetDecimalInput("Rate: ");
                string description = GetStringInput("Description: ");
                int categoryId = GetIntInput("Category ID: ");

                product.ProductName = productName;
                product.Rate = rate;
                product.Description = description;
                product.CategoryId = categoryId;

                Product.Update(product);

                Console.WriteLine("Product updated successfully.");
            }
            else
            {
                Console.WriteLine("Product not found.");
            }
        }

        static void DeleteProduct()
        {
            int productId = GetIntInput("Enter the Product ID to delete: ");
            Product.Delete(productId);

            Console.WriteLine("Product deleted successfully.");
        }

        static void GetAllProducts()
        {
            var allProducts = Product.GetAllProducts();

            if (allProducts.Count == 0)
            {
                Console.WriteLine("No products found.");
            }
            else
            {
                Console.WriteLine("All products:");
                foreach (var product in allProducts)
                {
                    Console.WriteLine($"Product ID: {product.ProductId}, Name: {product.ProductName}, Description: {product.Description}, Rate: {product.Rate}, Category ID: {product.CategoryId}");
                }
            }
        }

        static int GetIntInput(string message)
        {
            while (true)
            {
                Console.Write(message);
                string input = Console.ReadLine();
                if (int.TryParse(input, out int result))
                    return result;
                Console.WriteLine("Invalid input. Please enter a valid integer.");
            }
        }

        static decimal GetDecimalInput(string message)
        {
            while (true)
            {
                Console.Write(message);
                string input = Console.ReadLine();
                if (decimal.TryParse(input, out decimal result) && result > 0)
                    return result;
                Console.WriteLine("Invalid input. Please enter a valid decimal greater than 0.");
            }
        }

        static string GetStringInput(string message)
        {
            while (true)
            {
                Console.Write(message);
                string input = Console.ReadLine();
                if (!string.IsNullOrEmpty(input))
                    return input;
                Console.WriteLine("Invalid input. Please enter a non-empty string.");
            }
        }
    }
}