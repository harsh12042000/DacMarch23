using System.Data;
using System.Data.SqlClient;

namespace DatabasePractice
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Connect();
            Employee employee = new Employee
            {
                EmpNo = 9,
                Name = "Rohit",
                Basic = 69880,
                DeptNo = 30
            };

            //Insert();
            //InsertObj(employee);
            //InsertWithParameters(employee);
            //InsertWithStoredProcedures(employee);
            //QueryReturningSingleValue();
            //SqlDataReader1();
            //SqlDataReaderNextResult();
        }

        static void Connect()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                Console.WriteLine("Success !");
            } catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            if(cn.State == ConnectionState.Open)
                cn.Close();
        }

        static void Insert()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = cn;
                sqlCommand.CommandType = CommandType.Text;
                sqlCommand.CommandText = "INSERT INTO Employees VALUES(6, 'Priyanka', 5000, 20)";
                sqlCommand.ExecuteNonQuery();
                Console.WriteLine("ok !");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }

        static void InsertObj(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = cn;
                sqlCommand.CommandType = CommandType.Text;
                sqlCommand.CommandText = $"INSERT INTO Employees VALUES({obj.EmpNo}, '{obj.Name}', {obj.Basic}, {obj.DeptNo})" +
                    $"";
                sqlCommand.ExecuteNonQuery();
                Console.WriteLine("ok !");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }

        static void InsertWithParameters(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = cn;
                sqlCommand.CommandType = CommandType.Text;
                //sqlCommand.CommandText = "INSERT INTO Employees VALUES(@X, @1, @Y, @2)";
                sqlCommand.CommandText = "INSERT INTO Employees VALUES(@EmpNo, @Name, @Basic, @DeptNo)";

                //sqlCommand.Parameters.AddWithValue("@X", obj.EmpNo);
                //sqlCommand.Parameters.AddWithValue("@1", obj.Name);
                //sqlCommand.Parameters.AddWithValue("@Y", obj.Basic);
                //sqlCommand.Parameters.AddWithValue("@2", obj.DeptNo);

                sqlCommand.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                sqlCommand.Parameters.AddWithValue("@Name", obj.Name);
                sqlCommand.Parameters.AddWithValue("@Basic", obj.Basic);
                sqlCommand.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                sqlCommand.ExecuteNonQuery();
                Console.WriteLine("ok !");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }
        static void InsertWithStoredProcedures(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand sqlCommand = new SqlCommand();
                sqlCommand.Connection = cn;
                sqlCommand.CommandType = CommandType.StoredProcedure;
                sqlCommand.CommandText = "InsertEmployee";

                sqlCommand.Parameters.AddWithValue("@EmpNo", obj.EmpNo);
                sqlCommand.Parameters.AddWithValue("@Name", obj.Name);
                sqlCommand.Parameters.AddWithValue("@Basic", obj.Basic);
                sqlCommand.Parameters.AddWithValue("@DeptNo", obj.DeptNo);

                sqlCommand.ExecuteNonQuery();
                Console.WriteLine("ok !");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }

        //one row, one column
        static void QueryReturningSingleValue()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = cn;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "SELECT COUNT(*) FROM Employees";

                object returnVal = cmdSelect.ExecuteScalar();

                Console.WriteLine(returnVal);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }
        static void SqlDataReader1()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = cn;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "SELECT * FROM Employees";

                SqlDataReader sqlDataReader = cmdSelect.ExecuteReader();

                while(sqlDataReader.Read())
                {
                    Console.WriteLine(sqlDataReader["Name"] + " " + sqlDataReader["DeptNO"]);
                }

                sqlDataReader.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }
        static void SqlDataReaderNextResult()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\ProjectModels;Initial Catalog=cdac;Integrated Security=True;";

            try
            {
                cn.Open();
                SqlCommand cmdSelect = new SqlCommand();
                cmdSelect.Connection = cn;
                cmdSelect.CommandType = CommandType.Text;
                cmdSelect.CommandText = "SELECT * FROM Employees; SELECT * FROM Departments";

                SqlDataReader sqlDataReader = cmdSelect.ExecuteReader();

                while (sqlDataReader.Read())
                {
                    Console.WriteLine(sqlDataReader["Name"] + " " + sqlDataReader["DeptNO"]);
                }

                sqlDataReader.NextResult();

                while(sqlDataReader.Read())
                {
                    Console.WriteLine(sqlDataReader["DeptName"]);
                }

                sqlDataReader.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally { cn.Close(); }
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

    }
}