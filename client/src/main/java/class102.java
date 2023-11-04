public class class102 {
	public class370 field661;
	public class370 field662;
	public int field663;

	public class102(int var1, class370 var2, class370 var3) {
		this.field663 = var1;
		this.field661 = var2;
		this.field662 = var3;
	}

	static void method468(Player var0, int var1, int var2) {
		if (var1 == var0.animationId && var1 != -1) {
			int var4 = class116.getAnimationDefinition(var1).loopType;
			if (var4 == 1) {
				var0.animationFrame = 0;
				var0.animationFrameCycle = 0;
				var0.animationDelay = var2;
				var0.curAnimationFrameIndex = 0;
			}

			if (var4 == 2) {
				var0.curAnimationFrameIndex = 0;
			}
		} else if (var1 == -1 || var0.animationId == -1 || class116.getAnimationDefinition(var1).field741 >= class116.getAnimationDefinition(var0.animationId).field741) {
			var0.animationId = var1;
			var0.animationFrame = 0;
			var0.animationFrameCycle = 0;
			var0.animationDelay = var2;
			var0.curAnimationFrameIndex = 0;
			var0.field403 = var0.pathLength;
		}

	}
}
