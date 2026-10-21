SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM 
	tbl_menu
WHERE
	menu_name LIKE '%김치%' OR menu_price < 10000
ORDER BY
	menu_price,
	menu_name DESC;

	
    
    
