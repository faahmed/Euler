require 'prime'

consecutive_four = []

i = 2
loop do 
  if i.prime_division.count == 4
    consecutive_four.push(i)
  else 
    consecutive_four = []
  end
  break if consecutive_four.count == 4
  i += 1
end

puts consecutive_four[0]
