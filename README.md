# JewelBooks POS Invoice — Android preview

This repository builds an **installable Android debug APK** using GitHub Actions. It is an **offline calculator prototype only**. It does NOT log in to JewelBooks, save official invoices, post purchases, or synchronize inventory. Do not use it as a production POS.

## GitHub upload (important)
1. Create a **private** GitHub repository.
2. Extract the ZIP and upload **all files and directories at repository root**, including the hidden `.github` directory. Do not upload the ZIP as one file. `settings.gradle` must be at repository root.
3. Open **Actions → Build JewelBooks POS APK → Run workflow** (or push to `main`).
4. After successful run, open the run and download artifact **JewelBooks-POS-Preview-APK**. Unzip it and install `app-debug.apk` on an Android phone (you may need to allow installation from that source).

## Safety / limits
- Debug APK is signed with GitHub's ephemeral debug key; installing an APK from a different workflow run may require uninstalling the previous debug build first.
- This app loads its calculator UI from bundled `app/src/main/assets/pos.html`.
- The `Print preview` button is browser-oriented and Android print integration is not implemented.
- No backend credentials or business records are included.
- The existing JewelBooks website and inventory are not modified.

## Build locally
Install Android SDK 35 and Java 17, then use Gradle 8.10.2: `gradle :app:assembleDebug`.

## Next phase
Implement server-side admin authentication, transactional invoice creation, idempotent stock movements, old-metal purchases, reversal, and reconciliation against the existing JewelBooks API, then test with non-production records before enabling live posting.
