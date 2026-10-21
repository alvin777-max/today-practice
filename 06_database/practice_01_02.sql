SELECT
	menu_name,
    menu_price
FROM tbl_menu
WHERE
	menu_name LIKE '%밥%'
	AND menu_price BETWEEN 20000 AND 30000;