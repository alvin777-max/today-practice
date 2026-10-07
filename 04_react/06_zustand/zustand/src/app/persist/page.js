'use client'
import { usePersistStore } from "@/store/usePersistSotre";
import { useEffect, useState } from "react";

export default function PersistPage() {
    const {theme, toggleTheme} = usePersistStore();

    // Hydration 에러 해결 - 서버와 브라우저의 첫 렌더링 결과를 맞추기 위한 상태
    const [isMounted, setIsMounted] = useState(false);

    useEffect(() => {
        setIsMounted(true);
    },[])

    if(!isMounted) return <div>로딩 중...</div>

    return (
        <div style={{background: theme === "dark" ? "#333" : "#fff"}}>
            <p>현재 테마: {theme}</p>
            <button onClick={toggleTheme}>테마 변경</button>
        </div>
    )
}

// 1. 서버에서 HTML 생성 - 항상 초기값을 기준으로 만듬 - white
// 2. 브라우저가 HTML 표시 - 저장하고 있는 값을 기준으로 만듬 - dark
// 3. React가 브라우저 실팽
// 4. 기존 HTML에 이벤트, 상태 연결 - hydration 1,2를 비교해서 만듬-> 불일치 오류
// 서버와 브라우저를 처음엔 일치시킴 후 렌더링할때 달라지게함

// skipHydration 기능 활용 가능