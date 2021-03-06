# Test description

We value the ability to model problems in software, so our first assessment 
will be around that subject. The exercise is to model and code a simple 
supermarket pricing solution. It is inspired on [PragDave Supermaket Kata]
(http://codekata.com/kata/kata01-supermarket-pricing/.

Focus on how to price a supermarket shopping basket and in particular on how to
calculate more complex prices such as

- Three cans of beans for the price of two.
- Two cans of Coke, for £1.
- Oranges for £1.99/kilo.

Use the following example of a receipt to know what data needs to be captured. 
There's no requirement to actually format or print a receipt.

```
    Beans                0.50
    Beans                0.50
    Beans                0.50
    Coke                 0.70
    Coke                 0.70
    Oranges
    0.200 kg @  £1.99/kg 0.40
                        -----
    Sub-total            3.30

    Savings
    Beans 3 for 2       -0.50
    Coke 2 for £1       -0.40
                        -----
    Total savings       -0.90
    -------------------------
    Total to Pay         2.40
```


Keep it simple and to the point, no web, persistence, ORM layers or frameworks.
What we want to see is what classes you create, their responsibility and 
relationships with other classes. Add what assumptions, design decisions and 
compromises you’ve taken in NOTES.md. Please put the code in a git repo of 
your choice and commit often, so we can see how you grow your code.

Also, please think how to make this flexible, think about immutability, and the
[S.O.L.I.D principles](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design).

This is the time to show us why you love to write good clean code. We will also
run your code over our static analysis tool, so make sure it doesn't have any 
issues.

You can use TDD, or BDD, or just good selective test coverage. Tests really 
help us understand your design; what you think are the important business 
rules that are to be protected when changes come later.

You can use any architectural pattern, eg. Uncle bob's clean architecture, or
ports and adapters, or onion, or another of your choice.

**For bonus, describe what REST resources and uri would be appropriate.**
