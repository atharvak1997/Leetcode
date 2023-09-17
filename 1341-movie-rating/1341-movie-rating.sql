# Write your MySQL query statement below
(select u.name as results
from Users u, MovieRating m
where u.user_id = m.user_id
group by m.user_id
order by count(m.user_id) desc, u.name limit 1)

union all

(select m.title as results
from MovieRating as r, Movies as m
where m.movie_id = r.movie_id 
and r.created_at like "2020-02-%"
Group By r.movie_id 
Order by avg(r.rating) desc, m.title limit 1)