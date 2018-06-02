int main() {
   string a = "\"\nbda\\\"\ndbd\\c\"\\\"c\\c\"";
   string b = "\\ab\nac\"\"add\n\"\nac\ndb\"";
   string c = "\nabbdbdd\\\\\"d\"c\\adc\"c";
   print(c + b + b + c + c + a + c + b + c + b);
   print(c + c + a + a + a + c + c + b + b + b);
   print(b + a + c + b + c + c + b + b + a + c);
   print(b + a + c + a + a + a + b + b + b + c);
   print(b + a + b + a + c + c + c + b + c + a);
   print(a + a + c + c + a + c + b + c + c + a);
   print(b + b + b + b + c + a + c + b + a + a);
   print(a + a + c + b + a + b + c + c + b + b);
   print(c + b + a + a + c + b + a + a + c + b);
   print(a + c + b + b + b + c + c + c + b + c);
   return 0;
}


/*!! metadata:
=== comment ===
刘予希 liuyuxi-codegen pretest-转义字符大测试
=== is_public ===
True
=== assert ===
output
=== timeout ===
1.0
=== input ===

=== phase ===
codegen pretest
=== output ===

abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c"
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db""
bda\"
dbd\c"\"c\c"
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c
abbdbdd\\"d"c\adc"c\ab
ac""add
"
ac
db"
abbdbdd\\"d"c\adc"c
=== exitcode ===
0

!!*/
