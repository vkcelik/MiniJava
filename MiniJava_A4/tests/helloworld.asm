.ORIG x3000
  ;  initialize CONST0 and CONST1
  AND R2, R2, 0
  ADD R3, R2, 1
  ;  set SFP and HP 
  LD R6, LAB_12
  LD R4, LAB_13
  BR LAB_11
  ;  data for SFP and HP
LAB_12
.FILL 32768
LAB_13
.FILL 65023
LAB_11
LAB_10
  ; 
  ;  METHOD main
  ; 
  ;  save SFP R7 and initialize SP R5
  STR R7, R6, 2
  LEA R0, LAB_9
  STR R0, R6, 3
  ADD R5, R6, 4
  ;  body 
  ; 
  ;  STRING CONST BEGIN 
  ; 
  BR LAB_19
LAB_18
.STRINGZ "Hello World"
LAB_16
.FILL LAB_18
.FILL 13
LAB_17
.FILL LAB_16
LAB_19
  LD R0, LAB_17
  ADD R5, R5, 1
  STR R0, R5, -1
  ; 
  ;  STRING CONST END 
  ; 
  ADD R5, R5, -1
  LDR R0, R5, 0
  BRz LAB_21
  LDR R0, R0, 0
  BR LAB_15
LAB_21
  LEA R0, LAB_20
  BR LAB_15
LAB_20
.STRINGZ "null"
  BR LAB_15
LAB_14
.FILL LAB_1
LAB_15
  TRAP x22
  LD R1, LAB_14
  JSRR R1
  ; 
  ;  RETURN BEGIN
  ; 
  ;  get return PC from stack frame
  LDR R7, R6, 2
  RET
  ; 
  ;  RETURN END
  ; 
  ; 
  ;  METHOD END main
  ; 
  ; 
  ;  helper functions 
  ; 
  ; 
  ; 
  ; 
  ; 
  ;  translate top of stack to string, pushes result
  ; 
LAB_3
  ; 
  ; This algorithm takes the 2's complement representation of a signed
  ; integer, within the range -999 to +999, and converts it into an ASCII
  ; string consisting of a sign digit, followed by three decimal digits.
  ; 
  ADD R5, R5, -1
  LDR R0, R5, 0
  ADD R5, R5, 1
  STR R7, R5, -1
  LEA R1, LAB_22
  ADD R0, R0, 0
  BRzp LAB_25
  LD R7, LAB_23
  STR R7, R1, 0
  ADD R1, R1, 1
  NOT R0, R0
  ADD R0, R0, 1
LAB_25
  AND R7, R7, 0
  LD R2, LAB_26
LAB_27
  ADD R0, R0, R2
  BRn LAB_28
  ADD R7, R7, 1
  BR LAB_27
  ; 
LAB_28
  ADD R7, R7, 0
  BRz LAB_52
  LD R2, LAB_24
  ADD R7, R7, R2
  STR R7, R1, 0
  ADD R1, R1, 1
LAB_52
  LD R2, LAB_29
  ADD R0, R0, R2
  ; 
  AND R7, R7, 0
LAB_30
  LD R2, LAB_31
LAB_32
  ADD R0, R0, R2
  BRn LAB_33
  ADD R7, R7, 1
  BR LAB_32
  ; 
LAB_33
  ADD R7, R7, 0
  BRz LAB_51
  LD R2, LAB_24
  ADD R7, R7, R2
  STR R7, R1, 0
  ADD R1, R1, 1
LAB_51
  LD R2, LAB_34
  ADD R0, R0, R2
  ; 
  AND R7, R7, 0
LAB_35
  LD R2, LAB_36
LAB_37
  ADD R0, R0, R2
  BRn LAB_38
  ADD R7, R7, 1
  BR LAB_37
  ; 
LAB_38
  ADD R7, R7, 0
  BRz LAB_50
  LD R2, LAB_24
  ADD R7, R7, R2
  STR R7, R1, 0
  ADD R1, R1, 1
LAB_50
  LD R2, LAB_39
  ADD R0, R0, R2
  ; 
  AND R7, R7, 0
LAB_40
  LD R2, LAB_41
LAB_42
  ADD R0, R0, R2
  BRn LAB_43
  ADD R7, R7, 1
  BR LAB_42
  ; 
LAB_43
  ADD R7, R7, 0
  BRz LAB_49
  LD R2, LAB_24
  ADD R7, R7, R2
  STR R7, R1, 0
  ADD R1, R1, 1
LAB_49
  ADD R0, R0, 10
  ; 
  LD R7, LAB_24
LAB_45
  ADD R7, R7, R0
  STR R7, R1, 0
  ADD R1, R1, 1
  AND R2, R2, 0
  STR R2, R1, 0
  ADD R5, R5, -1
  LDR R7, R5, 0
  LEA R0, LAB_22
  ADD R5, R5, 1
  STR R0, R5, -1
  RET
  ; 
  ; data
  ; 
LAB_22
  .BLKW 7
LAB_23
.FILL 45
LAB_24
.FILL 48
LAB_26
.FILL -10000
LAB_31
.FILL -1000
LAB_36
.FILL -100
LAB_41
.FILL -10
LAB_46
.FILL -1
LAB_29
.FILL 10000
LAB_34
.FILL 1000
LAB_39
.FILL 100
LAB_44
.FILL 10
LAB_47
.FILL 1
  ; 
  ;  print newline 
  ; 
LAB_1
  ADD R5, R5, 1
  STR R7, R5, -1
  LD R0, 1
  BR LAB_53
.FILL LAB_54
LAB_54
.STRINGZ "\n"
LAB_53
  TRAP x22
  ADD R5, R5, -1
  LDR R7, R5, 0
  RET
LAB_2
  ; 
  ;  create an object with size top of stack, result in HP
  ; 
  ADD R5, R5, -1
  LDR R0, R5, 0
  ; allocate object
  NOT R0, R0
  ADD R0, R0, 1
  ADD R4, R4, R0
  ADD R5, R5, 0
  BRp LAB_57
  ADD R4, R4, 0
  BRp LAB_58
LAB_59
  ADD R1, R5, 0
  NOT R1, R1
  ADD R1, R1, 1
  ADD R1, R4, R1
  BRp LAB_56
  BR LAB_58
LAB_57
  ADD R4, R4, 0
  BRn LAB_56
  BR LAB_59
LAB_58
  TRAP x25
LAB_56
  ADD R5, R5, 1
  STR R4, R5, -1
  RET
  ; 
  ;  nullify 
  ; 
  ;  overwrites memory area a to b with 0s 
  ;  expects operands in top of stack 
  ;  assumes a<b!!! 
LAB_5
  ADD R5, R5, -2
  LDR R0, R5, 0
  LDR R1, R5, 1
  ADD R5, R5, 1
  STR R0, R5, -1
  NOT R0, R0
  ADD R0, R0, 1
  ADD R1, R1, R0
  ADD R5, R5, -1
  LDR R0, R5, 0
LAB_60
  STR R2, R0, 0
  ADD R0, R0, 1
  ADD R1, R1, -1
  BRp LAB_60
  RET
  ; 
  ;  multiplication routine 
  ; 
  ;  expects operands on top of stack 
LAB_4
  ;  while loop that multiplies a and b, R7 is sum 
  ADD R5, R5, -2
  LDR R0, R5, 0
  LDR R1, R5, 1
  ;  get a and b
  ;  check signs 
  ;  CONST0 is used to store the flag of the result
  ;  0 means positive (default), 1 negative
  ADD R0, R0, 0
  ;  if one is zero we're done
  BRz LAB_63
  ;  if a is positive, jump
  BRp LAB_64
  ;  negate a 
  NOT R0, R0
  ADD R0, R0, 1
  ADD R1, R1, 0
  ;  if one is zero we're done
  BRz LAB_63
  ;  if b is positive, jump
  BRp LAB_65
  ;  a is neg, b is too
  ;  negate b
LAB_66
  NOT R1, R1
  ADD R1, R1, 1
  ;  go, multiply!
  BR LAB_61
LAB_65
  ;  a is negative, b is positive
  ;  set flag to 1 for negative result
  ADD R2, R2, 1
  ;  go, multiply!
  BR LAB_61
LAB_64
  ;  a is positive 
  ADD R1, R1, 0
  ;  if one is zero we're done
  BRz LAB_63
  ;  if b is positive, go multiply!
  BRp LAB_61
  ;  a is pos, b is neg
  ;  set flag to 1 for negative result
  ADD R2, R2, 1
  BR LAB_66
  ; 
  ;  multiply 
  ; 
LAB_61
  ADD R5, R5, 1
  STR R7, R5, -1
  ;  reset sum
  AND R7, R7, 0
LAB_67
  ADD R7, R7, R0
  ADD R1, R1, -1
  BRp LAB_67
  ;  adjust sign 
  ADD R2, R2, 0
  BRz LAB_68
  NOT R7, R7
  ADD R7, R7, 1
LAB_68
  ;  reset CONST0 
  AND R2, R2, 0
  ;  transfer sum to TMP0, get RET from stack
  ADD R0, R7, 0
  ADD R5, R5, -1
  LDR R7, R5, 0
  ;  result in R0 
  ADD R5, R5, 1
  STR R0, R5, -1
  RET
  ;  one factor was 0
LAB_63
  ADD R5, R5, 1
  STR R2, R5, -1
  RET
  ; 
  ;  null pointer exception 
  ; 
  ;  prints error message and exits
LAB_7
  LEA R0, LAB_69
  TRAP x22
  TRAP x25
LAB_69
.STRINGZ "Null pointer exception
"
  ; 
  ;  index out of bounds exception 
  ; 
  ;  prints error message and exits
LAB_8
  LEA R0, LAB_70
  TRAP x22
  TRAP x25
LAB_70
.STRINGZ "Index out of bounds exception
"
  ; 
  ;  add two strings 
  ; 
  ;  expects args on top of stack, puts result on stack
LAB_6
  LDR R0, R5, -2
  BRnp LAB_74
  LEA R0, LAB_76
  STR R0, R5, -2
  BR LAB_75
LAB_74
  LDR R0, R5, -1
  BRnp LAB_75
  LEA R0, LAB_76
  STR R0, R5, -1
  BR LAB_75
LAB_76
.FILL LAB_77
.FILL 5
LAB_77
.STRINGZ "null"
LAB_75
  ADD R5, R5, -2
  LDR R0, R5, 0
  LDR R1, R5, 1
  ADD R5, R5, 1
  STR R7, R5, -1
  ;  compute combined length 
  LDR R7, R0, 1
  ADD R5, R5, 1
  STR R0, R5, -1
  ADD R0, R7, 0
  LDR R7, R1, 1
  ADD R5, R5, 1
  STR R1, R5, -1
  ADD R0, R0, R7
  BR LAB_72
LAB_73
.FILL LAB_2
LAB_71
.FILL 2
  ;  copy string 
LAB_79
.FILL LAB_78
LAB_78
  ADD R5, R5, 1
  STR R7, R5, -1
  LDR R0, R0, 0
LAB_81
  LDR R7, R0, 0
  BRz LAB_80
  STR R7, R1, 0
  ADD R0, R0, 1
  ADD R1, R1, 1
  BR LAB_81
LAB_80
  ADD R5, R5, -1
  LDR R7, R5, 0
  RET
LAB_72
  ;  invoke new method 
  LD R1, LAB_71
  ADD R0, R1, R0
  ADD R5, R5, 1
  STR R0, R5, -1
  LD R1, LAB_73
  JSRR R1
  ;  initialize object pointed to by HP 
  ;  initialize string 
  ADD R0, R4, 2
  STR R0, R4, 0
  ;  initialize length 
  ADD R5, R5, -1
  LDR R0, R5, 0
  STR R0, R4, 1
  ;  get two strings 
  ADD R5, R5, -2
  LDR R0, R5, 0
  LDR R1, R5, 1
  ADD R5, R5, 1
  STR R1, R5, -1
  ;  copy first string from TMP0->0 to HP->0 
  LDR R1, R4, 0
  LD R7, LAB_79
  JSRR R7
  ;  copy second string from TMP0->0 to HP->0 
  ADD R5, R5, -1
  LDR R0, R5, 0
  LD R7, LAB_79
  JSRR R7
  ADD R5, R5, -1
  LDR R7, R5, 0
  ADD R5, R5, 1
  STR R4, R5, -1
  RET
.END
