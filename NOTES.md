# Notes

Please add here any notes, assumptions and design decisions that might help up
understand your though process.

To model a supermarket shopping basket, I'll have a Product, a Basket Item, a
Discount and the basked itself.

I usually separate my items in packages according to their responsibilities, for
instance, I'll have the classes mentioned above in a pojo package.  So I'll 
start from there.

I use BigDecimals, as they guarantee a better level of precision  for financial
calculations, avoiding the floating point rounding inconsistencies.

I also use the NumberFormat utility to format my currency values, according to
the locale of the computer running. 

At this point, I needed a class to actually calculate my bill. And another to 
display my bill.
