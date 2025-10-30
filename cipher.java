/*encription caesar cipher with a shift of +3(cyclic)
a->d,b->d,...,y->b,z->c
similarly for uppercase letters
digits will also shift cyclically(e.g.,7->0,8->1)
encrypted=(original_digit+3)%10;
so for 80:
first digit=(8+3)%10=1;
second digit=(0+3)%10=3
other characters and punctuations remain unchanged.*/