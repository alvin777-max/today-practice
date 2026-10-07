import { create } from "zustand";

export const useCartStore = create((set)=> ({
    items: [],

    addItem: (item) => set((state) => ({
        items: [...state.items, item], // 불변성! (기존 배열을 직접 수정하면 안된다-react가 감지 못해서 리렌더링 안됨) /스프레드 문법 / 스프레드 대신 immer
    })),

    removeItem: (id) => set((state) => ({
        items: state.items.filter((item) => item.id !== id)
    })),

    clearCart: () => set({items:[] })
}))