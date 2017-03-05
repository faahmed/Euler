increment_by = 2 
last = 1
sum = 1
corners = 0

until last == 1001**2
  last += increment_by
  sum += last 
  corners += 1
  increment_by += 2 if corners % 4 == 0
end

puts sum
