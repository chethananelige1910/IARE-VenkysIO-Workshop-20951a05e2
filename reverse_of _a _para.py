def reve(strng):
    if len(strng) == 0:
        return strng
    else:
        return reverse(strng[1:]) + strng[0]
a = str(input("Enter the string to be reversed: "))
print(reve(a))
