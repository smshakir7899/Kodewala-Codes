package com.example.app;

public class DiscountCalculator
{
	public int getDiscount(DiscountType type) {

        switch (type) {
            case NEW:
                return 5;

            case REGULAR:
                return 10;

            case PREMIUM:
                return 20;

            case VIP:
                return 30;

            default:
                return 0;
        }
    }
}
