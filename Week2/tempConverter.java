public class tempConverter
{
        public double celsius(double f)
        {
            double celsius = 5.0 / 9.0 * (f - 32.0);
            return celsius;
        }

        public double fahrenheit(double c)
        {
            double fahrenheit = 9.0 / 5.0 * c + 32;
            return fahrenheit;
        }
}
