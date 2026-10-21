SELECT * FROM tbl_menu;
SELECT * FROM tbl_category;

SELECT 
	b.menu_code,
	b.menu_name,
    b.menu_price,
    a.category_code,
    b.orderable_status
From
	tbl_category AS a
LEFT JOIN
	tbl_menu AS b 
ON	a.category_code = b.category_code
WHERE category_name <> '기타'
		AND category_name <> '쥬스'
        AND category_name <> '커피'
        AND orderable_status <> 'N'
        AND b.menu_price = 13000;
	
    
    
    
    
/* WHERE
	ref_category_code IS NOT NULL 
    AND orderable_status != 'N'
ORDER BY
	category_name DESC; */
    