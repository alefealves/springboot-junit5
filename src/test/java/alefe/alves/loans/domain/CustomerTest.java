package alefe.alves.loans.domain;

import alefe.alves.loans.factory.CustomerFactory;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Nested
    class isIncomeEqualOrLowerThan{
        @Test
        void shoulBeTrueWhenIncomeIsEqual(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrLowerThan(5000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsLowerThan(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrLowerThan(9000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsGreaterThanValue(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrLowerThan(8000.00));
        }
    }

    @Nested
    class isIncomeEqualOrGreaterThan{
        @Test
        void shoulBeTrueWhenIncomeIsEqual(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrLowerThan(5000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsGreaterThan(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrLowerThan(9000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsLowerThanValue(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrLowerThan(8000.00));
        }
    }

    @Nested
    class isIncomeBetween{
        @Test
        void shoulBeTrueWhenIncomeIsBetween(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeBetween(3000.00, 8000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsEqualToMin(){
            var customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeBetween(3000.00, 8000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsEqualToMax(){
            var customer = CustomerFactory.build(8000.00);

            assertTrue(customer.isIncomeBetween(3000.00, 8000.00));
        }

        @Test
        void shoulBeTrueWhenIncomeIsNotBetween(){
            var customer = CustomerFactory.build(5000.00);

            assertFalse(customer.isIncomeBetween(3000.00, 4500.00));
        }
    }

    @Nested
    class isAgeLowerThan{
        @Test
        void shoulBeTrueWhenAgeIsLowerThan(){
            var customer = CustomerFactory.build(25);

            assertTrue(customer.isAgeLowerThan(30));
        }

        @Test
        void shoulBeFalseWhenAgeIsLowerThan(){
            var customer = CustomerFactory.build(25);

            assertFalse(customer.isAgeLowerThan(22));
        }

        @Test
        void shoulBeFalseWhenAgeIsEqualToValue(){
            var customer = CustomerFactory.build(25);

            assertFalse(customer.isAgeLowerThan(25));
        }
    }

    @Nested
    class isFromLocation{
        @Test
        void shoulBeTrueWhenLocationIsTheSame(){
            var customer = CustomerFactory.build("SP");

            assertTrue(customer.isFromLocation("SP"));
        }

        @Test
        void shoulBeFalseWhenLocationIsTheSame(){
            var customer = CustomerFactory.build("SP");

            assertFalse(customer.isFromLocation("RJ"));
        }
    }
}