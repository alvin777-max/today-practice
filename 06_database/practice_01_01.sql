SELECT 
	category_code,
	category_name
From
	tbl_category
WHERE
	ref_category_code IS NOT NULL
ORDER BY
	category_name DESC;